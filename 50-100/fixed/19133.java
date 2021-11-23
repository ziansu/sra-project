public void setpathSchedule(int compt) throws java.io.FileNotFoundException {
    if ((this.pathschedule.size()) == compt) {
        this.pathschedule.add(currentCoord);
    }else {
        this.pathschedule.set(((this.pathschedule.size()) - 1), currentCoord);
    }
}