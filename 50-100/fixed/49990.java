public static void main(java.lang.String[] args) throws java.lang.Exception {
    csse230project.CityStructure test = csse230project.WriteDomain.read("usdomain.xml");
    java.lang.System.out.println(test.getCityMap().toString());
    java.lang.System.out.println(test.cityInterestToArrayList().toString());
}