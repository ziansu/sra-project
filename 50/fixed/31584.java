@org.junit.Test
public void typeCheckConstructor1() {
    typeCheckClass(("\\static \\data D (n : Nat) {k : Nat} (m : Nat) | con\n" + ("\\static \\function idp {A : \\Type0} {a : A} => path (\\lam _ => a)\n" + "\\static \\function f : con {1} {2} {3} = (D 1 {2} 3).con => idp")));
}