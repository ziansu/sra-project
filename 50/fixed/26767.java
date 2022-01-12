public static java.lang.String getBanner() throws java.io.IOException {
    return new java.lang.String(java.nio.file.Files.readAllBytes(com.netscape.cms.servlet.base.PKIService.bannerFile)).trim();
}