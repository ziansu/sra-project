public void addPathInstance(microbat.model.trace.PathInstance path) {
    if (this.instanceList.isEmpty()) {
        this.instanceList.add(path);
        this.labelInstance = path;
    }else {
        if (!(this.instanceList.contains(path))) {
            this.instanceList.add(path);
        }
    }
}