@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/addListItem")
@javax.ws.rs.Consumes(value = MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = MediaType.APPLICATION_JSON)
public list.nice.ajax.Response addListItem(javax.xml.bind.JAXBElement<list.nice.dal.dto.WishListItem> item, @list.nice.ajax.Context
list.nice.ajax.HttpHeaders header) throws java.io.UnsupportedEncodingException, java.security.GeneralSecurityException {
    java.lang.String cookie = header.getCookies().get("nicelist").getValue();
    java.lang.String[] entry = cookie.split(":");
    list.nice.dal.dto.WishListItem wish = item.getValue();
    return list.nice.ajax.Response.status(Response.Status.OK).header("Access-Control-Allow-Origin", "*").entity(list.nice.bll.WishListBLL.addWishListItem(wish, entry[0], entry[1])).build();
}