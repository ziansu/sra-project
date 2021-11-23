@asg.cliche.Command(description = "Get a Rating based on id")
public java.lang.String getRating(@asg.cliche.Param(name = "id")
long id) {
    rating = moviAPI.getRating(id);
    return rating.toString();
}