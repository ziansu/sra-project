public void testSystemIntegrate() {
    check("Integrate(Sin(x*y),y)", "-Cos(x*y)/x");
    check("Integrate(x^(-1),x)", "Log(x)");
    check("Integrate(x^(-1),{x,0,1})", "Integrate(1/x,{x,0,1})");
    check("Integrate(x^a, x)", "x^(1+a)/(1+a)");
    check("Integrate(f(x), x)", "Integrate(f(x),x)");
    check("Integrate(x^(-1),{x, 0, 1})", "Integrate(1/x,{x,0,1})");
    check("Integrate(f(x)+g(x), {x, a, b})", "Integrate(f(x)+g(x),{x,a,b})");
    check("Integrate(Sin(x), {x, 3, 4})", "Cos(3)-Cos(4)");
    check("Integrate(Sin(x), {x, a, b})", "Cos(a)-Cos(b)");
    check("Integrate(Sin(x*y),y)", "-Cos(x*y)/x");
    check("D(-Cos(x*y)*x^(-1),y)", "Sin(x*y)");
    check("Integrate(Sin(x*y),{y, 0, x})", "1/x-Cos(x^2)/x");
}