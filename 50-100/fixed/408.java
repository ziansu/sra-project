@org.junit.Test
public void findById_TodoEntryNotFound_ShouldThrowException() {
    when(repositoryMock.findById(ru.doccloud.docs.service.RepositoryDocsCrudServiceTest.ID)).thenThrow(new ru.doccloud.common.exception.DocumentNotFoundException(""));
    com.googlecode.catchexception.CatchException.catchException(service).findById(ru.doccloud.docs.service.RepositoryDocsCrudServiceTest.ID);
    verify(repositoryMock, times(1)).findById(ru.doccloud.docs.service.RepositoryDocsCrudServiceTest.ID);
    verifyNoMoreInteractions(repositoryMock);
}