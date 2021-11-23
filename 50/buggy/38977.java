public static void main(java.lang.String[] args) {
    java.lang.Runtime rt = new java.lang.Runtime(org.test.framework.core.runtime.TestClassException.class, org.test.framework.core.runtime.TestClass.class);
    java.lang.System.out.println(rt.execute().summary());
}