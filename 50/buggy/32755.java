@java.lang.Override
public net.mv.forum.forum.dto.ForumDto findForumById(java.lang.Long id) {
    net.mv.forum.forum.domain.Forum forum = forumRepository.findOne(id);
    java.lang.System.out.println(forum.getPosts());
    net.mv.forum.forum.dto.ForumDto forumDto = new net.mv.forum.forum.dto.ForumDto(forum);
    java.lang.System.out.println(forumDto.getPosts());
    return forumDto;
}