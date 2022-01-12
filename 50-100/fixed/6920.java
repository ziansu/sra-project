public void save() {
    int bugTrackerCount = bugTrackers.length;
    for (int i = 0; i < bugTrackerCount; i++) {
        if (bugTrackers[i].equals("github")) {
            githubIssue.raise(this);
        }else
            if (bugTrackers[i].equals("bugzilla")) {
            }
        
    }
}