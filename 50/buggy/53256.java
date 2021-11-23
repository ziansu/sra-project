@java.lang.Override
protected javax.servlet.Filter[] getServletFilters() {
    return new javax.servlet.Filter[]{ new org.springframework.web.filter.ShallowEtagHeaderFilter() , new guru.drinkit.security.SimpleCORSFilter() };
}