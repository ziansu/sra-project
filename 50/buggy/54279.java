public int replaceManuscript(model.Manuscript theManuscript, model.Manuscript theReplacement) {
    int pass = removeManuscript(theManuscript);
    pass = submitManuscript(theReplacement);
    return pass;
}