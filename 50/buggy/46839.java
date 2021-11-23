public javax.media.j3d.BranchGroup getGroup() {
    group = null;
    group = makeShape(model);
    return group;
}