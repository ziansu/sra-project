@org.springframework.web.bind.annotation.RequestMapping(value = "/product/delete.action")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.Map<java.lang.String, java.lang.Object> delete(@org.springframework.web.bind.annotation.RequestBody
java.util.Map data) {
    try {
        productService.delete(data.get("data"));
        java.util.Map<java.lang.String, java.lang.Object> modelMap = new java.util.HashMap<>();
        modelMap.put("success", true);
        return modelMap;
    } catch (java.lang.Exception e) {
        return getModelMapError("Ошибка при удаление продуктов.");
    }
}