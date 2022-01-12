static Kernel32Library.HANDLE open_device(java.lang.String path, boolean enumerate) {
    purejavahidapi.windows.Kernel32Library.Kernel32Library.HANDLE handle;
    int desired_access = (enumerate) ? 0 : (GENERIC_WRITE) | (GENERIC_READ);
    int share_mode = (enumerate) ? (FILE_SHARE_READ) | (FILE_SHARE_WRITE) : FILE_SHARE_READ;
    handle = CreateFileA(path, desired_access, share_mode, null, purejavahidapi.windows.OPEN_EXISTING, purejavahidapi.windows.FILE_FLAG_OVERLAPPED, null);
    return handle;
}