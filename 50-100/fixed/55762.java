private void setIsDone(boolean isDone) {
    if (isDone && (!(this.isDone))) {
        name.setName(("(Done)" + (name.toString())));
        this.isDone = true;
    }else
        if ((!isDone) && (this.isDone)) {
            name.setName(name.toString().replace("(Done)", ""));
            this.isDone = false;
        }
    
    this.isDone = isDone;
}