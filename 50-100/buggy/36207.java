@java.lang.Override
public boolean saveTextFile(edu.asu.spring.quadriga.domain.workspace.ITextFile txtFile) throws edu.asu.spring.quadriga.exceptions.FileStorageException, edu.asu.spring.quadriga.exceptions.QuadrigaStorageException {
    java.lang.String txtId = txtFileDAO.generateUniqueID();
    txtFile.setTextId(txtId);
    edu.asu.spring.quadriga.dto.TextFileDTO txtFileDTO = tfSMapper.getTextFileDTO(txtFile);
    txtFileDTO.setTextId(txtId);
    txtFileDAO.saveNewDTO(txtFileDTO);
    return fileSaveServ.saveFileToLocal(txtFile);
}