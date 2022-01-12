public void addPathInstance(microbat.model.trace.PathInstance path) {
    if (this.instanceList.isEmpty()) {
        this.instanceList.add(path);
        try {
            checkLabelInstance(path);
            this.labelInstance = path;
        } catch (microbat.recommendation.LabelPathIncompatibleException e) {
        }
    }else {
        if (!(this.instanceList.contains(path))) {
            this.instanceList.add(path);
        }
    }
}