@org.junit.Test
public void testImportSignatureVote() {
    org.mockito.Mockito.when(voteMap.add(moe.cdn.cweb.security.CwebImportServiceImplTest.CONTENT_HASH, moe.cdn.cweb.TorrentTrustProtos.SignedVote.newBuilder().setSignature(moe.cdn.cweb.security.CwebImportServiceImplTest.VOTE_1_SIGNATURE).setVote(moe.cdn.cweb.security.CwebImportServiceImplTest.VOTE_1).build())).thenReturn(com.google.common.util.concurrent.Futures.immediateFuture(true));
    org.junit.Assert.assertTrue(cwebImportServiceImpl.importSignature(moe.cdn.cweb.security.CwebImportServiceImplTest.VOTE_1, moe.cdn.cweb.security.CwebImportServiceImplTest.VOTE_1_SIGNATURE));
}