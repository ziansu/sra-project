private void setIsDone(boolean isDone) {
    if (isDone && ((this.isDone) == false)) {
        name.setName(("(Done)" + (name.toString())));
        this.isDone = true;
    }else
        if ((!isDone) && ((this.isDone) == true)) {
            name.setName(name.toString().replace("(Done)", ""));
            this.isDone = false;
        }
    
}