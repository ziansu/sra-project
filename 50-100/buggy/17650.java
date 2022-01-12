@org.junit.Test
public void testMatMult() {
    assertEval("{ matrix(c(1,2,3,4), 2) %*% matrix(c(5,6,7,8), 2) }");
    assertEval("{ matrix(c(3,1,2,0,1,2), 2) %*% matrix(c(1,0,4,2,1,0), 3) }");
    assertEval("{ c(1,2,3) %*% c(4,5,6) }");
    assertEval("{ matrix(c(3,1,2,0,1,2),2) %*% c(1,0,4) }");
    assertEval("{ c(1,0,4) %*% matrix(c(3,1,2,0,1,2),3) }");
    assertEval("{ as.vector(c(1,2,3)) %*% t(as.vector(c(1,2))) }");
    assertEval("{ matrix(c(1+1i,2-2i,3+3i,4-4i), 2) %*% matrix(c(5+5i,6-6i,7+7i,8-8i), 2) }");
    assertEval("{ matrix(c(3+3i,1-1i,2+2i,0-0i,1+1i,2-2i), 2) %*% matrix(c(1+1i,0-0i,4+4i,2-2i,1+1i,0-0i), 3) }");
    assertEval("{ c(1+1i,2-2i,3+3i) %*% c(4-4i,5+5i,6-6i) }");
    assertEval("{ matrix(c(1+1i,0-0i,4+4i),3) %*% matrix(c(3+3i,1-1i,2+2i,0-0i,1+1i,2-2i),1) }");
    assertEval(Ignored.Unknown, "{ matrix(c(3+3i,1-1i,2+2i,0-0i,1+1i,2-2i),2) %*% c(1+1i,0-0i,4+4i) }");
    assertEval(Ignored.Unknown, "{ c(1+1i,0-0i,4+4i) %*% matrix(c(3+3i,1-1i,2+2i,0-0i,1+1i,2-2i),3) }");
}