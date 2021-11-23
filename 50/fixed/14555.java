public java.util.List<no.niths.domain.FadderGroup> getAll(no.niths.domain.FadderGroup group) {
    java.util.List<no.niths.domain.FadderGroup> all = repo.getAll(group);
    return all;
}