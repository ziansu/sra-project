@java.lang.Override
public void g(float f, float f1) {
    if (((npc) == null) || (!(npc.isFlyable()))) {
        super.g(f, f1);
    }else {
        net.citizensnpcs.util.NMS.flyingMoveLogic(this, f, f1);
    }
}