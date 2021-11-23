private boolean checkBatchEnd(org.apache.carbondata.core.scan.result.BatchResult batch) {
    if ((counter) < (batch.getSize())) {
        return false;
    }else {
        return true;
    }
}