public int compare(org.sat4j.pb.tools.AtLeastCard arg0, org.sat4j.pb.tools.AtLeastCard arg1) {
    int degreeComparison = (((arg0.getLits().size()) - (arg0.getDegree())) - (arg1.getLits().size())) + (arg1.getDegree());
    return degreeComparison != 0 ? degreeComparison : 1;
}