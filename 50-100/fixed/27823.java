@org.springframework.web.bind.annotation.RequestMapping(value = "/postRepresentative", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String postRepresentative(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, java.lang.InterruptedException, java.sql.SQLException {
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
    java.util.Scanner scanner = new java.util.Scanner(request.getInputStream());
    while (scanner.hasNextLine()) {
        stringBuilder.append(scanner.nextLine());
    } 
    java.lang.String body = stringBuilder.toString();
    return zvMain.runDragnDropInterfaceQuerySeparated(body, "RepresentativeTrends");
}