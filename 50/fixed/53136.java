@java.lang.Override
public org.springframework.data.domain.Page<com.swp.model.Post> getListPost(int pageNumber) {
    return postRepository.findAll(new org.springframework.data.domain.PageRequest((pageNumber - 1), 10));
}