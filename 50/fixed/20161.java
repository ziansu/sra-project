@org.springframework.transaction.annotation.Transactional
public com.gmail.dzhivchik.domain.Folder getFolder(java.lang.Integer id) {
    return folderDAO.getFolder(id);
}