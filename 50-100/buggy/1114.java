public static java.util.List<Project466.IncomePerson> findKNN(Project466.IncomePerson key, int k, int kNNRatio) {
    java.util.ArrayList<Project466.IncomePerson> ipsWithDist = new java.util.ArrayList<>();
    for (Project466.IncomePerson ip : Project466.Project.data) {
        ip.getDistance(key);
        ipsWithDist.add(ip);
    }
    java.util.Collections.sort(ipsWithDist);
    return ipsWithDist.subList(0, (kNNRatio * (ipsWithDist.size())));
}