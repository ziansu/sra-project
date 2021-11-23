public boolean CheckCollision(GameObject obj1, GameObject obj2) {
    if (((obj1.GetMaxX()) < (obj2.GetMinX())) || ((obj1.GetMinX()) > (obj2.GetMaxX())))
        return false;
    
    if (((obj1.GetMaxY()) < (obj2.GetMinY())) || ((obj1.GetMinY()) > (obj2.GetMaxY())))
        return false;
    
    return true;
}