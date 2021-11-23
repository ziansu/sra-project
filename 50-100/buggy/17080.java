@java.lang.Override
public void deleteChapter(com.dungeoncrawlers.dto.ChapterDTO chapterDTO) {
    com.dungeoncrawlers.beans.Chapter chapter = new com.dungeoncrawlers.beans.Chapter();
    chapter.setCampaign(chapterDTO.getCampaign());
    chapter.setDescription(chapterDTO.getDescription());
    chapter.setImage(chapterDTO.getImage());
    chapter.setName(chapterDTO.getName());
    chapter.setOrder(chapterDTO.getOrder());
    daoimpl.deleteChapter(chapter);
}