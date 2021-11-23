protected void damageTarget(int id, int type, Helpers.Vector3 dir) {
    log(("pocisk trafił w cell o id = " + id));
    struckTarget = null;
    for (target.Target target : targets) {
        if ((target.getId()) == id)
            struckTarget = target;
        
    }
    if ((struckTarget) != null) {
        log("znalezione ten cel, usuwamy");
        targets.remove(struckTarget);
    }
}