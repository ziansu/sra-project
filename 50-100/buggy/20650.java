private void patchIHDR(li.tengfei.apng.base.AngPatchItem patchItem) {
    int count = (li.tengfei.apng.base.PngStream.IHDR_LEN) - (patchItem.dstOffset);
    count -= (count < (patchItem.size)) ? count : patchItem.size;
    java.lang.System.arraycopy(patchItem.data, patchItem.srcOffset, mHeadData, ((li.tengfei.apng.base.PngStream.PNG_SIG_LEN) + (patchItem.dstOffset)), count);
}