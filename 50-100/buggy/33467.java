public static phys2d.collisionLogic.collisionCheckers.SimplexDirStruct getCollisionResolution(phys2d.entities.shapes.Shape s1, phys2d.entities.shapes.Shape s2) {
    java.lang.System.out.println(phys2d.collisionLogic.tools.LinePolyTools.polyDifference(s1, s2));
    phys2d.collisionLogic.collisionCheckers.SimplexDirStruct gjkInfo = phys2d.collisionLogic.collisionCheckers.CollisionCheckerGJKEPA2.computeSimplex(s1, s2);
    if (gjkInfo.isColliding)
        phys2d.collisionLogic.collisionCheckers.CollisionCheckerGJKEPA2.computeCollisionResolutionEPA(s1, s2, gjkInfo);
    else
        phys2d.collisionLogic.collisionCheckers.CollisionCheckerGJKEPA2.computeMinimumDisplacement(s1, s2, gjkInfo);
    
    return gjkInfo;
}