public java.util.List<no.niths.domain.FadderGroup> getAll(no.niths.domain.FadderGroup group) {
    java.util.List<no.niths.domain.FadderGroup> all = repo.getAll(group);
    for (no.niths.domain.FadderGroup gr : all) {
        gr.getLeaders().size();
    }
    return all;
}