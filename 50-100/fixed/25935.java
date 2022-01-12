protected void damageTarget(int id, int type, Helpers.Vector3 dir) {
    log(("pocisk trafił w cell o id = " + id));
    for (target.Target target : targets) {
        if ((target.getId()) == id)
            struckTarget = target;
        
    }
    if ((struckTarget) != null) {
        log("znalezione ten cel, usuwamy");
    }
}