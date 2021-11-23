@com.example.rest.POST
@com.example.authentication.Secured
@com.example.rest.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@com.example.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public com.example.model.UserStory postUserStory(com.example.model.UserStory story) {
    com.example.repository.UserStoryRepository.add(story);
    return story;
}