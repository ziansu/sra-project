@org.junit.Test
public void testImportVote() {
    org.mockito.Mockito.when(voteMap.put(moe.cdn.cweb.security.CwebImportServiceImplTest.CONTENT_HASH, moe.cdn.cweb.TorrentTrustProtos.SignedVote.newBuilder().setSignature(moe.cdn.cweb.security.CwebImportServiceImplTest.VOTE_1_SIGNATURE).setVote(moe.cdn.cweb.security.CwebImportServiceImplTest.VOTE_1).build())).thenReturn(com.google.common.util.concurrent.Futures.immediateFuture(true));
    org.junit.Assert.assertTrue(cwebImportServiceImpl.importVote(moe.cdn.cweb.security.CwebImportServiceImplTest.VOTE_1));
}