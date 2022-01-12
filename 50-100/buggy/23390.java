@org.junit.Test
public void testAdd5() {
    java.lang.System.out.println("add");
    polynomials.Poly a = new polynomials.Poly(new double[]{  });
    polynomials.Poly b = new polynomials.Poly(new double[]{  });
    polynomials.Poly expResult = new polynomials.Poly(new double[]{  });
    polynomials.Poly result = polynomials.Poly.add(a, b);
    assertEquals(expResult, result);
}