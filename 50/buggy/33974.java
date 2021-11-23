public boolean deleteProvider(java.lang.String providerName) {
    assert providerName != null : "The provider name is recieving null";
    boolean wasDeleted = false;
    dao.ProviderDAO providerDao = new dao.ProviderDAO();
    java.lang.System.out.println(("Nome do Fornecedor:" + providerName));
    wasDeleted = providerDao.deleteProvider(providerName);
    return wasDeleted;
}