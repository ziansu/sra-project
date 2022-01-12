@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/DeleteBrand", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String deleteBrand(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.ModelAttribute
com.auto.time.Model.Brand brand) {
    javax.servlet.http.HttpSession session = request.getSession();
    long brandId = java.lang.Long.valueOf(((java.lang.Long) (session.getAttribute("brand_id"))));
    brand.setId(brandId);
    brandDao.deleteBrand(brand);
    try {
        response.sendRedirect("/Pages/Brands.jsp");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return "Pages/Brands.jsp";
}