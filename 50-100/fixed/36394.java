@java.lang.Override
public com.dungeoncrawlers.beans.Chapter addChapter(com.dungeoncrawlers.dto.ChapterDTO chapterDTO) {
    com.dungeoncrawlers.beans.Chapter chapter = new com.dungeoncrawlers.beans.Chapter();
    chapter.setCampaign(chapterDTO.getCampaign());
    chapter.setDescription(chapterDTO.getDescription());
    chapter.setImage(chapterDTO.getImage());
    chapter.setName(chapterDTO.getName());
    return daoimpl.addChapter(chapter);
}