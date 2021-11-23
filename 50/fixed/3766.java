public void addTarget(sha.mpoos.agentsmith.entity.Target target) {
    if (!(this.targets.add(target))) {
        this.targets.remove(target);
        this.targets.add(target);
    }
}