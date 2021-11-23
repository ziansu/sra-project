public java.lang.String getMaxFileSize() {
    int bytes = _context.logManager().getFileSize();
    if (bytes <= 0)
        return "1.00 MB";
    
    return (net.i2p.data.DataHelper.formatSize2(bytes).replace("&nbsp;", " ")) + 'B';
}