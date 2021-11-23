public void changeIssueStatus(java.lang.String issueid, java.lang.String newstatus) {
    if ((issuesList) != null) {
        for (int i = 0; 1 < (issuesList.size()); i++) {
            if (issuesList.get(i).getId().equalsIgnoreCase(issueid)) {
                issuesList.get(i).getFields().getStatus().setName(newstatus);
                notifyItemChanged((i + 1));
                return ;
            }
        }
    }
}