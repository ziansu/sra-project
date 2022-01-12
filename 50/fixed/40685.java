@org.springframework.web.bind.annotation.RequestMapping(value = "/add", method = org.springframework.web.bind.annotation.RequestMethod.POST, headers = "Content-Type=application/json")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String addFavorite(@org.springframework.web.bind.annotation.RequestBody
com.manicure.favorite.entity.Favorite record) {
    favoriteService.insertSelective(record);
    return "0";
}