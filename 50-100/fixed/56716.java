public java.util.List<pl.sda.domain.Department> getDepartments(java.lang.String dname) {
    org.springframework.web.util.UriComponentsBuilder builder = org.springframework.web.util.UriComponentsBuilder.fromHttpUrl(((url) + "/departments/queries/byDname")).queryParam("dname", dname);
    pl.sda.domain.Department[] departments = restTemplate.getForObject(builder.build().encode().toUri(), pl.sda.domain.Department[].class);
    return java.util.Arrays.asList(departments);
}