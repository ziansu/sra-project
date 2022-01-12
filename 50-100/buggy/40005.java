@org.yuliskov.artportfolio.controller.RequestMapping(value = "/uploadcleanup", method = RequestMethod.POST, consumes = MediaType.TEXT_HTML_VALUE)
public org.yuliskov.artportfolio.controller.ResponseEntity<java.lang.Void> uploadCleanup(@org.yuliskov.artportfolio.controller.RequestBody
java.lang.String path) throws java.io.IOException {
    if (path.isEmpty()) {
        return new org.yuliskov.artportfolio.controller.ResponseEntity(HttpStatus.NO_CONTENT);
    }
    java.nio.file.Path abspath = java.nio.file.Paths.get(rootDir, path);
    logger.info("deleting file {}", abspath);
    java.nio.file.Files.deleteIfExists(abspath);
    return new org.yuliskov.artportfolio.controller.ResponseEntity(HttpStatus.OK);
}