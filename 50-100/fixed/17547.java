public void interpret() {
    this.say("Interpreting...");
    while ((location) < (lines.size())) {
        java.lang.String s = lines.get(location);
        if (s.contains("professor")) {
            this.loadProfessor();
        }
        (location)++;
    } 
    this.say("Done.");
    this.say(((this.professors.size()) + " Professors Loaded..."));
}