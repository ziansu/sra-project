@org.junit.Test
public void testLockResponseInvariants() {
    ch.elexis.core.lock.types.LockResponse permDeny = new ch.elexis.core.lock.types.LockResponse(ch.elexis.core.lock.types.LockResponse.Status.DENIED_PERMANENT, new ch.elexis.core.lock.types.LockInfo());
    assertFalse(permDeny.isOk());
    ch.elexis.core.lock.types.LockResponse denied = ch.elexis.core.lock.types.LockResponse.DENIED(new ch.elexis.core.lock.types.LockInfo());
    assertFalse(denied.isOk());
    ch.elexis.core.lock.types.LockResponse error = ch.elexis.core.lock.types.LockResponse.ERROR;
    assertFalse(error.isOk());
    ch.elexis.core.lock.types.LockResponse ok = ch.elexis.core.lock.types.LockResponse.OK();
    assertTrue(ok.isOk());
}