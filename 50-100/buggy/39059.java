@org.junit.Test
public void delete_TodoEntryNotFound_ShouldThrowException() {
    when(repositoryMock.delete(ru.doccloud.docs.service.RepositoryDocsCrudServiceTest.ID)).thenThrow(new ru.doccloud.common.exception.DocumentNotFoundException("", found));
    com.googlecode.catchexception.CatchException.catchException(service).delete(ru.doccloud.docs.service.RepositoryDocsCrudServiceTest.ID);
    verify(repositoryMock, times(1)).delete(ru.doccloud.docs.service.RepositoryDocsCrudServiceTest.ID);
    verifyNoMoreInteractions(repositoryMock);
}