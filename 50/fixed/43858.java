@org.springframework.web.bind.annotation.RequestMapping(value = (USER_SVC_PATH) + "/recommendations")
public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getRecommendations(@org.springframework.web.bind.annotation.RequestBody
edu.boun.cmpe451.group2.client.User user) {
    try {
        recipeModel.getRecommendations(user);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}