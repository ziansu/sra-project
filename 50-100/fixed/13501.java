public void replaceSelf(Ex argEx) {
    if ((master) == null) {
        java.lang.System.out.println(("Warning ! Replaceself attempt on an orphan Ex. Ignoring. I am : " + (this.report())));
        return ;
    }
    master.updatePoses();
    master.replaceTarget(posInMaster, argEx);
}