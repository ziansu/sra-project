@org.springframework.web.bind.annotation.RequestMapping(value = "/pedido", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String pedido(java.util.Locale locale, org.springframework.ui.Model model) {
    com.monkyinc.myweb.HomeController.logger.info("Welcome home! The client locale is {}.", locale);
    java.util.Date date = new java.util.Date();
    java.text.DateFormat dateFormat = java.text.DateFormat.getDateTimeInstance(java.text.DateFormat.LONG, java.text.DateFormat.LONG, locale);
    java.lang.String formattedDate = dateFormat.format(date);
    com.monkyinc.myweb.model.Producto p = com.monkyinc.myweb.model.Producto.createProducto(1, "NOT IN HERE", 18, "Playera");
    model.addAttribute("producto", p);
    model.addAttribute("serverTime", formattedDate);
    return "pedido";
}