public static java.util.List<Project466.IncomePerson> findKNN(java.util.ArrayList<Project466.IncomePerson> dataSet, Project466.IncomePerson key, int k) {
    java.util.ArrayList<Project466.IncomePerson> ipsWithDist = new java.util.ArrayList<>();
    for (Project466.IncomePerson ip : dataSet) {
        ip.getDistance(key);
        ipsWithDist.add(ip);
    }
    java.util.Collections.sort(ipsWithDist);
    return ipsWithDist.subList(0, k);
}