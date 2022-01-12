public static void main(java.lang.String[] args) throws java.lang.Exception {
    csse230project.WriteDomain.loadCities();
    csse230project.WriteDomain.loadPOI();
    csse230project.WriteDomain.loadLinks();
    csse230project.WriteDomain.write(csse230project.WriteDomain.map, "usdomain.xml");
    csse230project.CityStructure test = csse230project.WriteDomain.read("usdomain.xml");
    java.lang.System.out.println(test.getCityMap().toString());
    java.lang.System.out.println(test.cityInterestToArrayList().toString());
}